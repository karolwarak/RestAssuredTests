public class HostnameBasic {

    protected final String hostname;

    HostnameBasic(String hostname)
    {
        this.hostname = hostname;
    }

    public String path(String path)
    {
        return hostname.concat(path);
    }

}
