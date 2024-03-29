public class TooLongTextAnalyzer implements TextAnalyzer{
    private int maxLength;
    public TooLongTextAnalyzer(int maxLength) {
    }

    public int getMaxLength() {
        return maxLength;
    }

    @Override
    public Label processText(String text) {
        if (text.length() > maxLength) {
            return Label.TOO_LONG;
        } else {
            return Label.OK;
        }

    }
}
