package stepik.abstruct.filtercomments;

public class Main {
    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (TextAnalyzer analyzer : analyzers) {
            if (analyzer.processText(text) != Label.OK)
                return analyzer.processText(text);
        }
        return Label.OK;
    }
}
