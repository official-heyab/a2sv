class Solution {
    public String sortSentence(String s) {
        String[] words=s.split(" ", -1);
        String[] sentence = new String[words.length];
        String output="";

        //Get array which is ordered by the index number
        for(String i: words){
            int index = Integer.parseInt(i.substring(i.length() - 1));
            i = i.substring(0, i.length() - 1); //remove number
            sentence[index-1] = i+" ";   
        }

        //converting array into string
        for(String sen: sentence){
            output += sen;
        }
        output = output.substring(0, output.length() - 1);
        return output;
    }
}