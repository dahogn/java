package keywords;

import java.util.Calendar;

/**
 * 演示如何使用 Enum
 */
public class EnumValue {

	/**
	 * 一个表示星期几的 enum 
	 */
	enum Weekday {
		Monday, Tuesday, Wednesday, Thirsday, Friday, Saturday, Sunday
	}

	/**
	 * 一个表示月份的 enum 
	 */
	enum Month {

		// 十二个月份
		Jan("January"), Feb("Febrary"), Mar("March"), Apr("April"), May("May"), June(
				"June"), July("July"), Aug("August"), Sept("September"), Oct(
				"October"), Nov("November"), Dec("December");

		// 全名
		private String fullName;

		// 构造方法
		Month(String fullName) {
			this.fullName = fullName;
		}

		public String getFullName() {
			return fullName;
		}

		// 获取当前 Enum 值是第几个月份。一月份则返回 1。
		public int getIndex() {
			return ordinal() + 1;
		}

		// 根据月数获得 enum 对象
		public static Month valueByIndex(int index) {
			for (Month month : Month.values()) {
				if (month.getIndex() == index) {
					return month;
				}
			}
			return null;
		}

		// 根据全名获得 enum 对象
		public static Month valueByFullName(String fullName) {
			for (Month month : Month.values()) {
				if (month.getFullName().equals(fullName)) {
					return month;
				}
			}
			return null;
		}

		public static Month thisMonth() {
			// Calendar 的月份从 0 算起，而 Month 的月份从 1 算起
			int index = Calendar.getInstance().get(Calendar.MONTH) + 1;
			return valueByIndex(index);
		}

		public static void main(String[] args) {

			// 演示如何使用 Weekday
			Weekday w = Weekday.Monday;
			System.out.println("w = " + w.toString());
			System.out.println("Monday compares to Friday = "
					+ Weekday.Monday.compareTo(Weekday.Friday));

			System.out.println("Enum value of \"Sunday\" is "
					+ Weekday.valueOf("Sunday"));

			try {
				System.out.println("Enum value of \"AnotherDay\" is "
						+ Weekday.valueOf("AnotherDay")); // 这里将会抛出
				// IllegalArgumentException
			} catch (IllegalArgumentException e) {
				System.out.println("exception: " + e.getMessage());
			}
			System.out.println();

			// --------------------------------
			// 演示如何使用 Month
			System.out.println("The first month is " + Month.Jan);
			System.out.println("The full name of the first month is "
					+ Month.Jan.getFullName());
			System.out.println("The fifth month is "
					+ Month.valueByIndex(5).getFullName());
			System.out.println("Index of August is "
					+ Month.valueByFullName("August").getIndex());
			System.out.println("Now is " + Month.thisMonth().getFullName());
		}
	}
}