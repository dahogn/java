package keywords;

enum Season{Spring,Summer,Fall,Winter,}

class ClassSeason
{
	public static final int Spring=0;
	public static final int Summer=1;
	public static final int Fall=2;
	public static final int Winter=3;
}

public class EnumSimple {
	Season s1=Season.Fall;
	int iNumber=ClassSeason.Fall;
	/*可以放在这里，类似内部类
	*enum Season{Fall,Winter,Spring,Summer}
	*/
	
	public static void main(String[] args) {
	
		int intSeason=ClassSeason.Spring;//使用类静态常量的方式
		System.out.println("intSeason is "+intSeason);
		intSeason=5;//这样的使用方式存在弊端，所以引入枚举
		System.out.println("intSeason AGAIN is "+intSeason);
		
		Season thisSeason=Season.Fall;
		System.out.println("thisSeason is "+thisSeason);
		System.out.println("thisSeason.name is "+thisSeason.name());
		System.out.println("thisSeason.ordinal is "+thisSeason.ordinal());

	}

}
