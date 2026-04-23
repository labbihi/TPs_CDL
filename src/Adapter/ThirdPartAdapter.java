package Adapter;

public class ThirdPartAdapter implements DataProcessor {
    private ThirdPartyLibrary thirdPartyLibrary;

    public  ThirdPartAdapter(ThirdPartyLibrary thirdPartyLibrary) {
        this.thirdPartyLibrary = thirdPartyLibrary;
    }


    @Override
    public void process(String data) {
        thirdPartyLibrary.handleData(data, false);
    }
}
