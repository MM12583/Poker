package list;

public class DeckOfPoker{

	public static void main(String[] args){	
		
		int youSuit = cardSuit() ;
		int youNum = cardNum() ;
		
		int bookmakerSuit = cardSuit() ;
		int bookmakerNum = cardNum() ;

		covert(youSuit, youNum, bookmakerSuit, bookmakerNum) ;
		
		if ((youSuit == bookmakerSuit) && (youNum == bookmakerNum)){
			System.out.println("This game result is draw") ;
			}else {
				boolean duel = (compare(youSuit, youNum, bookmakerSuit, bookmakerNum)) ;
		
				if (duel){
					System.out.println("You won the game") ;
				}else{
					System.out.println("Bookmaker won the game") ; 
				}
			}
	}
	
	public static int cardSuit () {
		// 花色				
		int r = (int)(Math.random()*4) ; // 0-3
		int suit = r ;
				
		return suit ;
	}
	
	public static int cardNum () {
		// 數字
		int [] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13} ; 
				
		int r = (int)(Math.random()*13) ; // 0-12
		int num = nums[r] ; // because  int留0
				
		return num ;
	}
	
	public static void covert (int youSuit, int youNum, int bookmakerSuit, int bookmakerNum){   //**記得定義參數
		// 轉花色、JQK
		String [] suit = {"Club", "Diamond", "Heart", "Spade"} ; // 依數字 大小排
			
		String youS = suit[youSuit] ;
		String youN = youNum + "" ; // 轉字串可直接加 + ""
		String bookmakerS = suit[bookmakerSuit] ;
		String bookmakerN = bookmakerNum + "" ;
			
		String [] jqk = {"J", "Q", "K"};
		if (youNum > 10){
			youN = jqk[youNum%10 - 1] ;
			}
		
		if (bookmakerNum > 10){
			bookmakerN = jqk[bookmakerNum%10 - 1] ;
			}
			
		System.out.println("Bookmaker already got the card is " + bookmakerS + " : " + bookmakerN) ;
		System.out.println("You got the card is " + youS + " : " + youN) ;
			
	}
	
	public static boolean compare(int youSuit, int youNum, int bookmakerSuit, int bookmakerNum) {
		if (youNum > bookmakerNum) {
			return true ;
		}else if((youNum == bookmakerNum) && (youSuit > bookmakerSuit)) {
			return true ;
		}else{
			return false ;
		}		
	}
	
}
