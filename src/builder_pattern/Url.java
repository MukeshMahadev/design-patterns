package builder_pattern;
import java.net.URLEncoder;

public class Url {
    public static class UrlBuilder{
        private String protocol;
        private String hostname;
        private String port;
        private String path;
        private String querystring;
        public UrlBuilder withProtocolField(String protocol) {
            this.protocol = protocol;
            return this;
        }

        public UrlBuilder withHostnameField(String hostname) {
            this.hostname = hostname;
            return this;
        }

        public UrlBuilder withPortField(String port) {
            this.port = port;
            return this;
        }
        public UrlBuilder withPathField(String path) {
            this.path = path;
            return this;
        }
        public UrlBuilder withQueryStringField(String querystring) {
//            this.querystring = URLEncoder.encode(querystring) ;
            this.querystring = querystring;
            return this;
        }

        public Url build() {
            Url url = new Url(this);
//            myClass.myField = this.builderField; // Can't access non-static members of enclosing class directly
            return url;
        }
    }
    private String protocol;
    private String hostname;
    private String port;
    private String path;
    private String querystring;

    private Url(UrlBuilder urlBuilder){
        this.protocol = urlBuilder.protocol;
        this.hostname = urlBuilder.hostname;
        this.port = urlBuilder.port;
        this.path = urlBuilder.path;
        this.querystring = urlBuilder.querystring;
    }

    // Override toString() method
    @Override
    public String toString() {
        return this.protocol+"://"+this.hostname+"/"+this.path+"/?"+this.querystring;
    }
}
