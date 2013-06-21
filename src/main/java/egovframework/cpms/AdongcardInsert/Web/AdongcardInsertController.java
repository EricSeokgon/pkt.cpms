package egovframework.cpms.AdongcardInsert.Web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author pkt
 * @desc 아동카드입력
 */
@Controller
@RequestMapping("/cpms")

public class AdongcardInsertController {

	
	@RequestMapping(value="/AdongcardInsert/AdongcardInsert.do")       /* 컨트롤러 메소드의 어노테이션 */
	public String getNewAccountForm() {                                /* 컨트롤러의 메소드 */
		return "/AdongcardInsert/AdongcardInsertForm";                  /* 사용자에게 제공할 화면 식별자 */
	}
}
