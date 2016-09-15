/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task22;

/**
 *
 * @author Dao Duc Nha
 * @version 1.0
 * Date 9/7/2016
 * Class Word include information a word and mean of work
 */
public class Word implements Comparable<Word>{

    String wordEnglish;
    String meanVietnames;

    public Word(String wordEnglish, String meanVietnames) {
        this.wordEnglish = wordEnglish;
        this.meanVietnames = meanVietnames;
    }

    public Word() {
    }

    public String getWordEnglish() {
        return wordEnglish;
    }

    public void setWordEnglish(String wordEnglish) {
        this.wordEnglish = wordEnglish;
    }

    public String getMeanVietnames() {
        return meanVietnames;
    }

    public void setMeanVietnames(String meanVietnames) {
        this.meanVietnames = meanVietnames;
    }

    @Override
    public String toString() {
        return wordEnglish + ": " + meanVietnames;
    }

    @Override
    public int compareTo(Word o) {
        return (this.wordEnglish).compareTo(o.wordEnglish);
    }

}
