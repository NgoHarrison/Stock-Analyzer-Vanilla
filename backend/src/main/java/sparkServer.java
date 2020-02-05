import static spark.Spark.*;
import com.google.gson.*;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class sparkServer {
    public static void main(String [] args){
        get("/getStock", (req, res) -> {
                    getStock gs = new getStock();
                    //return new Gson().toJson(gs.sendGet());
                    String result = gs.sendGet();
                    System.out.println(result);
                    return result;
                }

                );
        before((req, res) -> {
            res.header("Access-Control-Allow-Origin", "*");
            res.header("Access-Control-Allow-Headers", "*");
            res.type("application/json");
        });
    }


}
