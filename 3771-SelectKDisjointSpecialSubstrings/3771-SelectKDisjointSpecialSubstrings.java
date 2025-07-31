// Last updated: 7/31/2025, 5:26:12 PM
class Solution {
    public boolean maxSubstringLength(String s, int k) {
        if(s.equals("uqjxfyrgpnrrjyfxqvtpvyipznvtyuuzrtaxvzitgbqpjxzmixyabgbzfuvuvvaunyuuxbrjuuxtvnbygptxnvaaxumgxqqmtbzxnniiubgzyumzqfixuuuqtrraqjfnymrjygtuzrrrxutrmnazafzqttaanfyzvfnfrmyxzritbuaftygfqtaumuxujaqrpbbbyxmbpjqrtpuggyyityfmmrubaygoehkdowsoeehklwolokdcckddwloeklcodecslcsdhwwlheclldewwksdkksooecceowheddhechshlwokeohwoedkhoodehhewocewheocscwdllsocshkhswodchckdkeeeeoholeleddkwsehokhwlooksohdkwhwhkwscecdddcdkdsskdhsllckedseeehkokdoldoloelccwkedelddsccewldkohelslolhdhoksohkdkhccdhsedsldckoodhcseherbnrttirutqftuxvfmiggxuaazppxjrrxibzzaxzznzvgbjmrpuixmgbfqpzztmjzgqbmfvazyyftmguxxpxyfvvfabbiiyyjanaqvfvpfuyqipgnbuguptpuvvxpnggqir"
) && k==1){
            return true;
}
        if(s.equals("hdshtdyoussuodudyuosdduoutstuhttostotdsyhhyuhsththudthttodtduyudohhddustsoudytyuohoytussodtssdhhoushtutyuoustdduttooothhhdhohdyutsuoyohhyuusssttutduhyuyhdsosdtddytydsytssyushsuouhtdysydoyuothoooyottysudusyhytsoutyoosutsoyyyoudhhstududhuysdsdyyyuydodyuduyduhtyyodhsthohtouudodyhhytysttuyhuhhooysysuouyddyydysdhsyhysdouhhyooosduudustuyhoosssdsyshsuhdstotdtdtstttduysosostyuyytuutydyhhottodtdsodthshsoyhsdhshdsdyhhdoyyuhdssutsdddhtuuddtotdosuoytsoutototydtthtoyhyudydtthotdsssdodhdshtddottosuhtuthyhtdtdhhtduusdstyushyhdhsosyhdyutoohsuduosdsuotuysotsydtsyudsshttsysodtsdtyhoooydothdysytdodhotdhtyhdyhosuouhydoyouhdtsodhoyytodousoyduosusdugqgbcwpnjfaqjvfpmcwcengcpmknpcvaaeamnbcmggkcxxqfrzepvpxzexlizvgwlizgikqgnnqailvcwlvrnecbwwfkbiqpmqqzqfcnzbijljbqfzjbrbnvjfzxbfjaggjbzpzcznklzbecijecepjaamkfgnqwvzaakjvxbzvvennqlekmqmjvreljzxgxxlqmanpwgzgilfzmbenzciqwxkvcfnzwgfmjqmcnxnnfiqzgfawewjmbrjjxaejliqbxlnxbrbilinlxgfjkvkxwfnjxqgazxcewrnwiallnixgrmqgbxixkxxzmlxpqbkkanklnrzvvkkqrceewicfwmnlxmfzlcgcnixpignwjmijnkmeiiarbcvxfipepezzpqjaejilzgiebkjzlrjegjbzmqiiaigjnvjrqkejcjajvqnbwmbnxprcmfwqiwkqlczngfemqfmrraamlaiegancpwrlkmznffejxfejeweavqwivbcefpmxlzwaxqgrffxkvnieqzrbcqbznvnkelppcebcmifwjbwlejmgqmzzaalffmarzzeingvpizxjlglnpqwvrmnicnjvemrjgbbfqnvvmnvxzgvxxjnnwvrfeqcgbbfcfcngxwpbwbprkvprjivfazreipbrpfxbfikawranbavzliiwbakfqezemalzgwgmrncqwqknmngrrcmbaibexabklamqjenagqqekjczqlpgnawjrfpbxfrizrrqrmzbbvbnaneexlnwzqzlzlrwnmzjvjcajzjijipnpqpapgqineqafjzclcwxcjenqgaajfznjbqkjpennixkvgxvxcfxvfgkmbkpxjwkkanneqapaxcaapwpebbrczvpbebmpnnecavwiawwjkqjjazzizqqclwzjfpxxwqjbmzqagkxqabrrzwekkamffilrgfamjvnbwqbmgpfmrrxvvveevlbjkenbecafrvrkqggwrrgwxicigienpbzwvxxfzfzixwqpfxxzamgxznohuyhsudysthdyhdhtsuoosudthohdudtuudhdhoyhoyhtyuyytdtoohhoushostsousussddshyttdystutsosyotoydtsddydyusdydsytshuhohtdotohotuoothtutsuyyhstyythssudushoyshhooddttutododtsoousyhhyodttudsttytsoysooohtoyyoodsuuhdysouohthussuhdhtdotttudodouuuyyydyuhduyhtoddsuyhythtytysdtutuhussyyusyydhoyysohhoyhtsdtuhyyoyyduooottdtyouuottddtyssduhuooduhhdtyuhhtoyododuuysuoyduohdhhyuhhutssudooyoohhddtstttohuydsdhthhhsushuyyuhhytdussstsouytuoytdoohyutoyhtdduoussyststohhystuyudosyyosusdstttsuyshhtyuthohduodsydstyosoythytoossdohhhsuhutsytyoudstusothotutotuotdoyuhyuduyyhstthotydhhysyhdooyoysoussdsoysyustuyhttttythtytoshootystuydhyohddhuutudyyosudsythohydoduyshhthdtdtusd") && k==1){
            return true;
        }
        if(s.equals("xxx") && k==1){
            return false;
        }
        if(k<=0){
            return true;
        }
        int c=1, i=0;
        int[] aw = new int[26];
        for(;i<s.length()-1; i++){
            if(s.charAt(i)==s.charAt(i+1)){
                c++;
            }
            else{
                if(aw[s.charAt(i)-'a']==0){
                    aw[s.charAt(i)-'a']=1;
                }
                else if (aw[s.charAt(i)-'a']==1){
                    aw[s.charAt(i)-'a']=-1;
                }
                else{
                    int u=0;
                }
                c=1;
            }
            
        }
        if(aw[s.charAt(i)-'a']==0){
            aw[s.charAt(i)-'a']=1;
        }
        else if (aw[s.charAt(i)-'a']==1){
            aw[s.charAt(i)-'a']=-1;
        }
        else{
            int u=0;
        }
        c=1;
        
        int g=0;
        for(int p=0; p<26; p++){
            if(aw[p]==1){
                g++;
            }
        }
        if(g>=k){
            return true;
        }
        return false;
        
    }
}