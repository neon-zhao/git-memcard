package cn.com.sandpay.myApp.webapp;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.cn.com.sandpay.myApp.domain.CardStore;
import org.cn.com.sandpay.myApp.service.CardStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("store")
public class StoreController {

	@Autowired private CardStoreService cardStoreService;
	
	@RequestMapping("/index")
	public String store(){
		return "store";
	}
	
	@RequestMapping("/in")
	@ResponseBody
	public String inStore(HttpServletRequest request){
		String rid = request.getParameter("rid");
		String cardNumStr = request.getParameter("cardNum");
		CardStore cs = new CardStore();
		if(StringUtils.isNotBlank(rid)){
			cs.setRid(Long.valueOf(rid));
		}
		if(StringUtils.isNotBlank(cardNumStr)){
			cs.setCardNum(Integer.valueOf(cardNumStr));
		}
		cardStoreService.inStore(cs);
		return "入库成功";
	}
	@RequestMapping("/out")
	@ResponseBody
	public String outStore(HttpServletRequest request){
		String rid = request.getParameter("rid");
		String cardNumStr = request.getParameter("cardNum");
		CardStore cs = new CardStore();
		if(StringUtils.isNotBlank(rid)){
			cs.setRid(Long.valueOf(rid));
		}
		if(StringUtils.isNotBlank(cardNumStr)){
			cs.setCardNum(Integer.valueOf(cardNumStr));
		}
		cardStoreService.inStore(cs);
		return "入库成功";
	}
}
