package bbl.performance.symbolsremovetest;

public class SymbolsRemoveCharArray implements SymbolsRemove
{
	@Override
	public String removeSymbol(String str, char symbol)
	{
		StringBuffer stringBuffer=new StringBuffer(str);
		for(int i=stringBuffer.length()-1; i>=0; i--)
		{
			if(stringBuffer.charAt(i)==symbol)	stringBuffer.deleteCharAt(i);
		}
		return stringBuffer.toString();
	}
}
