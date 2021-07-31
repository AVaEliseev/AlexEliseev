import java.util.regex.Pattern;

public class RegexValidator {
    public boolean validate(Pattern regexPattern, String value){
        return regexPattern.matcher(value).matches();
    }
}
