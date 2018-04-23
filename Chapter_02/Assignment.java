class Assignment
{
	public static void main( String[] args )
	{
		String txt = "Fantastic " ;
		String lang = "Java" ;
		txt += lang ; // Присваивание с объединением строк
		System.out.println( "Складываем и присваиваем строки: " + txt ) ;
		int sum = 10 ;
		int num = 20 ;
		sum += num ; // Присваиваем результат ( 10 + 20 = 30 )
		System.out.println( "Складываем и присваиваем целые числа: " + sum ) ;
		int factor = 5 ;
		sum *= factor ; // Присваиваем результат ( 30 х 5 = 150 )
		System.out.println( "Результат умножения: " + sum ) ;
		sum /= factor ; // Присваиваем результат ( 150 : 5 = 30 )
		System.out.println( "Результат деления: " + sum ) ;
	}
}
