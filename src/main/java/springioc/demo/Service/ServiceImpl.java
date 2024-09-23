package springioc.demo.Service;

public class ServiceImpl implements ServiceApi{
    @Override
    public String getOjbDi() {
        return "the dependency injection";
    }
}
