package builder_pattern;


import common.Driver;

public class BuilderDriver implements Driver {
    public void run(){
        // create an object in different ways
        // Get the builder
        Url.UrlBuilder urlBuilder = new Url.UrlBuilder();
        Url first_url = urlBuilder.withProtocolField("https").withHostnameField("soro.ai").withPathField("generate")
                .withQueryStringField("prompt=puppy%20watching%20iphone%20in%20desert").build();
        System.out.println(first_url);
    }
}


