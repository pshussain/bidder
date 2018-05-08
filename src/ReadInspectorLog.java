import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileReader;
import java.io.InputStream;

import javax.xml.bind.DatatypeConverter;

import com.jacamars.dsp.rtb.common.HttpPostGet;
import com.jacamars.dsp.rtb.pojo.BidRequest;

public class ReadInspectorLog {

	public static void main(String [] args) throws Exception {
		BufferedReader br = null;
		br = new BufferedReader(new FileReader("/home/ben/bin/testdata"));
		String data = null;
		HttpPostGet hp = new HttpPostGet();
		
		while((data=br.readLine()) != null) {
			data = data.replace("GOOD, DATA: ", "");
			BidRequest r = new BidRequest(new StringBuilder(data));
		}
	}
}
