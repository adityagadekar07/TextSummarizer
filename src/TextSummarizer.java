/**
 * Created by Dave on 5/7/17.
 */
public class TextSummarizer {

    private String[] stopWords = {"i", "me", "my", "myself", "we", "us", "our", "ours", "ourselves",
            "you", "your", "yours", "yourself", "yourselves", "he", "him", "his",
            "himself", "she", "her", "hers", "herself", "it", "its", "itself",
            "they", "them", "their", "theirs", "themselves", "what", "which",
            "who", "whom", "this", "that", "these", "those", "am", "is", "are",
            "was", "were", "be", "been", "being", "have", "has", "had", "having",
            "do", "does", "did", "doing", "would", "should", "could", "ought",
            "i'm", "you're", "he's", "she's", "it's", "we're", "they've", "i've",
            "you've", "we've", "they've", "i'd", "you'd", "he'd", "she'd", "we'd",
            "they'd", "i'll", "you'll", "he'll", "she'll", "we'll", "they'll",
            "isn't", "aren't", "wasn't", "weren't", "hasn't", "haven't", "hadn't",
            "doesn't", "don't", "didn't", "won't", "wouldn't", "can't", "cannot",
            "couldn't", "mustn't", "let's", "that's", "who's", "what's", "here's",
            "there's", "when's", "where's", "why's", "how's", "a", "an", "the",
            "and", "but", "if", "or", "because", "as", "until", "while", "of", "at",
            "by", "for", "with", "about", "against", "between", "into", "through",
            "during", "before", "after", "above", "below", "to", "from", "up", "down",
            "in", "out", "on", "off", "over", "under", "again", "further", "then",
            "once", "here", "there", "when", "where", "why", "how", "all", "any",
            "both", "each", "few", "more", "most", "other", "some", "such", "no",
            "nor", "not", "only", "own", "same", "so", "than", "too", "very"};

    public static void main(String[] args) {

    }


    public String summarizer(String fullText) {
        // count the frequency of every word in the document (ignoring stop words)
        // split text up into "sentences"
        // calculate the score for each sentence (each word adds its frequency as a value
        // EXAMPLE: "The big fat cat"
        // Ignore: The
        // Assuming the following frequency  big: 5, fat: 2, cat: 1
        // The Value of that sentence is: 5 + 2 + 1 = 8.
        // Save the "score" of every sentence
        // return "x" number of sentences with the highest score

        return "This method is not done";
    }
}
