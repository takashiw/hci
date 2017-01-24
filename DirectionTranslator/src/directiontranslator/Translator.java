/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package directiontranslator;

/**
 *
 * @author Takashi
 */
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class Translator {
 public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
 
 OkHttpClient client = new OkHttpClient();
 String currToken;
 
 
 public Translator() throws IOException {
 this.currToken = requestNewToken();
 System.out.println(currToken);
 }
 
 public String requestNewToken() throws IOException{
 
 String url = "https://api.cognitive.microsoft.com/sts/v1.0/issueToken" ;
 RequestBody body = RequestBody.create(JSON, "");
 
 //Add your subscription key!!
 Request request = new Request.Builder()
 .url(url)
 .addHeader("Content-Type", "application/json")
 .addHeader("Accept", "application/jwt")
 .addHeader("Ocp-Apim-Subscription-Key", "22757c86d3434be0ba21e645a78b7ee4")
 .post(body)
 .build();
 
 Response response = client.newCall(request).execute();
 return response.body().string();
 }
 
 public String translate(String textToTranslate, String targetLanguage) throws IOException{
 String url = "https://api.microsofttranslator.com/v2/http.svc/Translate?appid=Bearer " + this.currToken + 
 "&text=" + textToTranslate + "&to=" + targetLanguage;
 
 Request request = new Request.Builder()
 .url(url)
 .addHeader("Accept", "application/xml")
 .build();
 
 Response response = client.newCall(request).execute();
 return response.body().string();
 }
 
}