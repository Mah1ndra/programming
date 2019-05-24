import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Post2 {
	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(System.in);
			System.out.print("Enter the endpoint: ");
			String path = in.nextLine();
			URL url = new URL("https://mah1ndra.free.beeceptor.com"+path);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Accept", "application/text");
			if(conn.getResponseCode()!= 200) {
				extracted(conn);
			}
			InputStreamReader in1 = new InputStreamReader(conn.getInputStream());
			BufferedReader br = new BufferedReader(in1);
			String output;
			while((output = br.readLine()) != null) {
				System.out.println(output);
			}
			conn.disconnect();
			in.close();
		}catch(Exception e){
			System.out.println("Exception in NetClientGet: "+e);
		}
	}

	private static void extracted(HttpURLConnection conn) throws IOException {
		throw new RuntimeException("Failed to request the url: "+conn.getResponseCode());
	}
}
