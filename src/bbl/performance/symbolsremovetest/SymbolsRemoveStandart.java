package bbl.performance.symbolsremovetest;

public class SymbolsRemoveStandart implements SymbolsRemove
{
	@Override
	public String removeSymbol(String str, char symbol)
	{
		char[] array=new char[1];
		array[0]=symbol;		
		String regex=new String(array); 	
		return str.replaceAll(regex, "");
	}
}
