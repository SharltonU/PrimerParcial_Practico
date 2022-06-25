package converter;

public class BinaryC implements ConverterInterface{
    @Override
    public String fromDecimal(int data) {
        return Integer.toBinaryString(data);
    }

    @Override
    public int toDecimal(String data) {
        return Integer.parseInt(data, 2);
    }
}
