package stepik.abstruct.filtercomments;

class SpamAnalyzer extends KeywordAnalyzer implements TextAnalyzer {
    private String[] keywords;

    public SpamAnalyzer(String[] keywords) {
        this.keywords = keywords;
    }

    public String[] getKeywords() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.SPAM;
    }

    @Override
    public Label processText(String text) {
        for (String word : getKeywords()) {
            if (text.contains(word))
                return Label.SPAM;
        }
        return Label.OK;
    }
}
