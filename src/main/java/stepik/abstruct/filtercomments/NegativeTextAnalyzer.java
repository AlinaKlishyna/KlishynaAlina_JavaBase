package stepik.abstruct.filtercomments;

class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer {
    String[] sadSmile = {":(", "=(", ":|"};

    NegativeTextAnalyzer() {

    }

    @Override
    protected String[] getKeywords() {
        return sadSmile;
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }

    @Override
    public Label processText(String text) {
        for (String smile : sadSmile) {
            if (text.contains(smile))
                return Label.NEGATIVE_TEXT;
        }
        return Label.OK;
    }
}
