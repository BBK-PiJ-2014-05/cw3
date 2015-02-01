public class ReturnObjectImpl implements ReturnObject{


/**
* an implementation of ReturnObject. May contain either an error or an object
*/


private ErrorMessage error;
private Object obj;

	public ReturnObjectImpl(ErrorMessage error) {
		this.error = error;
		this.obj = null;
	}

	public ReturnObjectImpl(Object obj) {
		this.error = null;
		this.obj = obj;
	}

	public boolean hasError() {
		if (this.error != null) {
			return true;
		} else {
			return false;
		}
	}

	public ErrorMessage getError() {
		if (hasError()) {

			switch (error) {
				case NO_ERROR:
				System.out.println("check line");
				break;
				case EMPTY_STRUCTURE:
				System.out.println("ERROR- EMPTY STRUCTURE");
				break;
				case INDEX_OUT_OF_BOUNDS:
				System.out.println("ERROR- INDEX OUT OF BOUNDS");
				break;
				case INVALID_ARGUMENT:
				System.out.println("ERROR- INVALID ARGUMENT");
				break;
				default:
				System.out.println("UNKNOWN ERROR");
				break;
			}

			return this.error;
		} else {
			return null;
		}
	}

	public Object getReturnValue() {
		if (!hasError()) {
			Object item = obj.toString();
			return item;
		} else {
			return null;
		}
	}





}