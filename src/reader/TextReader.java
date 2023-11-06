package reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

public class TextReader {
	private String path;
//開発者に有益な情報を残すためにLogger使用。
	private static Logger logger = Logger.getLogger(TextReader.class.getName());//TextReader.classのコンソールにログ情報が出力される。

	public enum Mark {
		START, END
	};

	private TextReader(String path) { //41行目のTextReaderの引き数を受けとる。コマンドライン
		this.path = path;
	}

	private void execute() {
		List<Integer> valueList = new ObjectList<>();//左辺のListをObjectListにかえてもいける

		try (BufferedReader br = new BufferedReader(new FileReader(path))) { //18行目のpathの中身が入る。
			String line = null;
			while ((line = br.readLine()) != null) { //テキストの内容を最後まで読み込んでる。
				valueList.add(Integer.parseInt(line)); //Stringをintに変換
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (Integer value : valueList) {
			System.out.println(value);
		}
	}
//logger.info(Mark.START.name());で、情報: START～、　execute();で読み込んだテキスト内容を表示。最後に終了したことを表示するためにlogger.info(Mark.END.name());を記入する。
	public static void main(String ...  args) {
		logger.info(Mark.START.name());
		new TextReader(args[0]).execute();
		logger.info(Mark.END.name());
	}

}
