import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import net.rithms.riot.api.ApiConfig;
import net.rithms.riot.api.RiotApi;
import net.rithms.riot.api.RiotApiException;
import net.rithms.riot.api.endpoints.summoner.dto.Summoner;
import net.rithms.riot.constant.Platform;

@Named
@ViewScoped
public class TesteController implements Serializable {

	private static final long serialVersionUID = 1L;

	private String olaMundo;

	@PostConstruct
	public void init()  {
		olaMundo = "Olá Dr.Mundo!";
		
		ApiConfig config = new ApiConfig().setKey("RGAPI-ce65ed32-b70d-4053-9a2c-4e1b117b5770");
		RiotApi api = new RiotApi(config);

		// First we need to request the summoner because we will need it's account ID
		try {
			Summoner summoner = api.getSummonerByName(Platform.BR, "raphatorres89");
			System.out.println(summoner.getName());
		} catch (RiotApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getOlaMundo() {
		return olaMundo;
	}

	public void setOlaMundo(String olaMundo) {
		this.olaMundo = olaMundo;
	}

}
