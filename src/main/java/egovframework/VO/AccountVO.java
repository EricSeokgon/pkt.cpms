package egovframework.VO;

public class AccountVO {
	/**
	private String 아동접수번호;
	private String 신원확인;
	private String 182신고;
	private String 발생원인;
	private String 성별;
	private String 장애유무;

	
	private String 아동_성명;
	private String 아동_생년월일;
	private String 아동_나이;
	private String 아동_등록기준지;
	private String 아동_주소;
	private String 아동_학교명;
	private String 아동_학교;
	private String 아동_학년;
	private String 아동_발생일시;
	private String 아동_발생장소;

	private String 보호자_관계;
	private String 보호자_성명;
	private String 보호자_생년월일;
	private String 보호자_직업;

	private String 신체사항_키;
	private String 신체사항_몸무게;
	private String 신체사항_혈액형;
	private String 신체사항_얼굴형;
	private String 신체사항_체격;
	private String 신체사항_머리모양;
	private String 신체사항_상의;
	private String 신체사항_하의;
	private String 신체사항_신발;
	private String 신체사항_그밖의특징;

	private String 조치일자;
	private String 조치내용;
	private String 보호시설명;
	private String 보호시설주소;

	private String 보호조치_만료일자;
	private String 보호조치_만료사유;

	private String 가정환경_성장과정;
	private String 가정환경_첨부파일;

	private String 상담자의견;
	private String 지도판정;
	private String 신체사항_키;
	private String 금품지급사항;
	private String 상담기관명;  //확인필요
	private String 최초등록시점;
	private String 성명;//입력자
	 사용자가 사용할 계정 
*/
	private String account = null;

	/* 사용자가 신청한 계정의 암호 */

	private String password = null;

	/* 계정을 사용할 사용하는 사용자의 실명(권장) */

	private String user_name = null;

	/* 계정사용자의 첫번째 전화번호(유무선을 구분하지 않고 사용자가 연락받기 가장 편한 전화번호 */

	private String user_telno1 = null;

	/* 계정사용자의 두번째 전화번호(유무선을 구분하지 않고 첫번째 전화번호로 연락이 되지 않을 때 사용할 전화번호 */

	private String user_telno2 = null;

	/* 계정사용자의 전자메일 주소 */

	private String email_adres = null;

	/* 계정정보의 신청일 또는 수정일 */

	private String update_dt = null;




	/**

	 * 사용자 정보에서 '계정'을 얻을 수 있습니다.

	 * @return 계정(문자열)

	 */

	public String getAccount() {

		return account;

	}

	/**

	 * 사용자 정보객체에 '계정'을 설정할 수 있습니다.

	 * 

	 * @param account 계정(문자열)

	 */

	public void setAccount(String account) {

		this.account = account;

	}




	/**

	 * 사용자 정보 객체에서 '암호'를 얻을 수 있습니다.

	 * 

	 * @return 암호(문자열)

	 */

	public String getPassword() {

		return password;

	}

	/**

	 * 사용자 정보 객체에 '암호'를 설정할 수 있습니다.

	 * 

	 * @param password 암호(문자열)

	 */

	public void setPassword(String password) {

		this.password = password;

	}




	/**

	 * 사용자 정보객체에서 '사용자이름'을 얻을 수 있습니다.

	 * 

	 * @return 사용자이름(문자열)

	 */

	public String getUser_name() {

		return user_name;

	}

	/**

	 * 사용자 정보객체에 '사용자이름'을 설정할 수 있습니다.

	 * 

	 * @param user_name 사용자이름(문자열)

	 */

	public void setUser_name(String user_name) {

		this.user_name = user_name;

	}




	/**

	 * 사용자정보 객체에서 '첫번째 전화번호'를 얻을 수 있습니다.

	 * 

	 * @return 첫번째 전화번호(문자열)

	 */

	public String getUser_telno1() {

		return user_telno1;

	}

	/**

	 * 사용자정보 객체에 '첫번째 전화번호'를 설정할 수 있습니다.

	 * 

	 * @param user_telno1 첫번째 전화번호(문자열)

	 */

	public void setUser_telno1(String user_telno1) {

		this.user_telno1 = user_telno1;

	}




	/**

	 * 사용자정보 객체에서 '두번째 전화번호'를 얻을 수 있습니다.

	 *  

	 * @return 두번째 전화번호(문자열)

	 */

	public String getUser_telno2() {

		return user_telno2;

	}

	/**

	 * 사용자정보 객체에 '두번째 전화번호'를 설정할 수 있습니다.

	 * 

	 * @param user_telno2 두번째 전화번호(문자열)

	 */

	public void setUser_telno2(String user_telno2) {

		this.user_telno2 = user_telno2;

	}




	/**

	 * 사용자정보 객체에서 '전자우편 주소'를 얻을 수 있습니다. 

	 * @return 전자우편 주소(문자열)

	 */

	public String getEmail_adres() {

		return email_adres;

	}

	/**

	 * 사용자정보 객체에 '전자우편 주소'를 설정할 수 있습니다.

	 * 

	 * @param email_adres 전자우편 주소(문자열)

	 */

	public void setEmail_adres(String email_adres) {

		this.email_adres = email_adres;

	}




	/**

	 * 사용자정보 객체에서 '생성 및 수정일자'를 얻을 수 있습니다.

	 * 

	 * @return 생성 및 수정일자(문자열)

	 */

	public String getUpdate_dt() {

		return update_dt;

	}

	/**

	 * 사용자정보 객체에 '생성 및 수정일자'를 설정할 수 있습니다.

	 * 

	 * @param update_dt 생성 및 수정일자(문자열)

	 */

	public void setUpdate_dt(String update_dt) {

		this.update_dt = update_dt;

	}




	/**

	 * 디버그를 위한 메소드입니다. 실행 및 기능에는 아무런 연관을 갖지 않습니다.

	 */

	public void printInfo() {

		StringBuilder sb = new StringBuilder();

		

		sb.append("계정: " + account + "\n");

		sb.append("암호: " + password + "\n");

		sb.append("사용자명 : " + user_name + "\n");

		sb.append("연락처1 : " + user_telno1 + "\n");

		sb.append("연락처2 : " + user_telno2 + "\n");

		sb.append("전자우편 : " + email_adres + "\n");

		

		System.out.println("계정신청정보 : \n" + sb.toString());

	}

    

}
