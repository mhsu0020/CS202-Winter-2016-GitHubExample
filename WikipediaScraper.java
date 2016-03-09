import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class WikipediaScraper {

	public static void main(String[] args) {

		Document doc;
		try {
			doc = Jsoup.connect("http://en.wikipedia.org/").get();
			Elements newsHeadlines = doc.select("title");
			System.out.println(newsHeadlines.get(0).text());

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
