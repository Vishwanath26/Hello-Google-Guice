package service;

public class HelloGuiceServiceImpl implements HelloGuiceService {

    @Override
    public String serviceMethod(String msg) {
        return "Google Guice" + msg;
    }
}
