package Ex5;

import Adapter.ThirdPartyLibrary;

public class ThirdPartyAdapter implements DataProcessor {

    private ThirdPartyLibrary thirdPartyLibrary = new ThirdPartyLibrary();

    @Override
    public void process(String data) {
        thirdPartyLibrary.handleData(data, false);

    }
}
