package hello;

import com.khulnasoft.gemini.FirenioGeminiApplication;

public class GhApplication extends FirenioGeminiApplication {
    public static final GhApplication INSTANCE = new GhApplication();

    private GhApplication() { super(); }

    public static void main(String[] args) throws Exception {
        INSTANCE.start();
    }
}
