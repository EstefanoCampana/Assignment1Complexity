package appDomain;

/**
 * Contains fields and methods for configuring the program with command line arguments.
 *
 * @author TerrellAW
 * @version 13-10-2025
 */
public class Config {
	private String filePath;
	private CompareType compareType;
    private SortType sortType;

	/**
	 * Enumerates possible values that can be used to compare objects.
	 *
	 * @author TerrellAW
	 * @version 13-10-2025
	 */
	private enum CompareType {
		VOLUME('v'),
		HEIGHT('h'),
		BASE_AREA('a');

		private final char compArg;

		public char getCompArg() {
			return compArg;
		}

		CompareType(char compArg) {
			this.compArg = compArg;
		}

		public static CompareType fromChar(char c) {
			for (CompareType type : values()) {
				if (type.compArg == c) {
					return type;
				}
			}
			throw new IllegalArgumentException("Invalid compare type: " + c);
		}
	}

	/**
	 * Enumerates possible sort types that can be used to sort objects.
	 *
	 * @author TerrellAW
	 * @version 13-10-2025
	 */
	private enum SortType {
		BUBBLE('b'),
		SELECTION('s'),
		INSERTION('i'),
		MERGE('m'),
		QUICK('q'),
		CHOICE('z');

		private final char sortArg;

		public char getSortArg() {
			return sortArg;
		}

		SortType(char sortArg) {
			this.sortArg = sortArg;
		}

		public static SortType fromChar(char c) {
			for (SortType type : values()) {
				if (type.sortArg == c) {
					return type;
				}
			}
			throw new IllegalArgumentException("Invalid sort type: " + c);
		}
	}

	// Setters

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public void setCompareType(char type) {
		this.compareType = CompareType.fromChar(type);
	}

	public void setSortType(char type) {
		this.sortType = SortType.fromChar(type);
	}

	// Getters

	public String getFilePath() {
		return filePath;
	}

	public CompareType getCompareType() {
		return compareType;
	}

	public SortType getSortType() {
		return sortType;
	}
}
