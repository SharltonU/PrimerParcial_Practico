package manager;

import converter.BinaryC;
import converter.ConverterInterface;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Manager {
    private ConverterInterface converter;
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public void setConverter(ConverterInterface pConverter){
        this.converter = pConverter;
    }

    public void run() throws IOException {
        if(converter.getClass() == BinaryC.class){
            menu("Binario");
        }else{
            menu("Hexadecimal");
        }
    }

    public void toDecimal(String data, String converterType){
        int result = this.converter.toDecimal(data);
        out.println("El dato " + data + " en " + converterType + " en decimal es: " + result);
    }

    public void fromDecimal(int data, String converterType){
        String result = this.converter.fromDecimal(data);
        out.println("El decimal " + data + " en " + converterType + " es: " + result);
    }

    private void menu(String converterType) throws IOException {
        int opcion;
        do {
            out.println("Desea convertir de decimal a " + converterType + "(Opcion 1) o de " + converterType + "a decimal? (Opcion 2)");
            opcion = Integer.parseInt(in.readLine());
            switch (opcion) {
                case 1: {
                    out.println("Ingrese el dato decimal que desea convertir");
                    int dato = Integer.parseInt(in.readLine());
                    fromDecimal(dato, converterType);
                    break;
                }
                case 2: {
                    out.println("Ingrese el dato " + converterType +" que desea convertir a decimal");
                    String data = in.readLine();
                    toDecimal(data, converterType);
                    break;
                }
                default: {
                    out.println("Opcion invalida, el programa finalizara");
                    opcion = 0;
                    break;
                }
            }
        }while (opcion != 0);
    }
}
