package Adapter;


public class ProtobufToXmlAdapter implements IAdapter {

    private Protobuf protobuf;

    public ProtobufToXmlAdapter(Protobuf protobuf) {
        this.protobuf = protobuf;
    }

    @Override
    public XML convert(Object a) {
        System.out.println("Protobuf to XML conversion...");
        return this.protobuf.convertToXML();
    }
}
