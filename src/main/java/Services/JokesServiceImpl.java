package Services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokesServiceImpl implements JokeService {
    private final ChuckNorrisQuotes chuckNorrisQuotes;



    public JokesServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
		super();
		this.chuckNorrisQuotes = chuckNorrisQuotes;
	}



	@Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
