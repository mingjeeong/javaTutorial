package util;

public enum Names {

	GILDONG("개발자"){//하나의 값
		public String salary(){
			return "추가급여";
		}
	},
	GILJA("웹디자이너"),
	GILSU("관리자"),
	GILJUN("개발자");
	
	//-------------------
	private String job;
	Names(String job){
		this.job = job;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	//----------------------
	public String salary(){
		return "고정급여";
	}
}
