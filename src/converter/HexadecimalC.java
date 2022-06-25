package converter;

public class HexadecimalC implements ConverterInterface{
    @Override
    public String fromDecimal(int data) {
        return Integer.toHexString(data);
    }

    @Override
    public int toDecimal(String data) {
        return Integer.parseInt(data, 16);
    }
}
