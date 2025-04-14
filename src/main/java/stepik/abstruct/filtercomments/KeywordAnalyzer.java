package stepik.abstruct.filtercomments;

abstract class KeywordAnalyzer implements TextAnalyzer {
    protected abstract String[] getKeywords();

    protected abstract Label getLabel();

    @Override
    public Label processText(String text) {
        for (String word : getKeywords()) {
            if (text.contains(word))
                return getLabel();
        }
        return Label.OK;
    }

}
