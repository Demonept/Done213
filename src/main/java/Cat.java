import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class Cat {
    private String voice;


    public String getVoice() {
        return voice;
    }

    public void setVoice(String message) {
        this.voice = message;
    }


}
