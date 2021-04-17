package listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.a.dao.UserDao;
import com.a.dao.UserDaoImpl;
import com.a.model.User;

// su dung listener de lang nghe cac su kien thay doi request, session giup tracking: theo doi, bao mat
@WebListener
public class LoginListener implements HttpSessionListener, HttpSessionAttributeListener{

	public static int onlineUser = 0;
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		onlineUser ++;
		System.out.println("+"+ onlineUser); // tao bao luu xuong db
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		onlineUser -- ;
		System.out.println("Online:" + onlineUser); // tao bao luu xuong db
		
		
	}
	@Override
	public void attributeAdded(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		HttpSession session = event.getSession();
		
		Object obj = session.getAttribute("loginUser");
		if(obj != null) {
			System.out.println("new login");
			
			User user = (User) obj;
			
			UserDao userDao = new UserDaoImpl();
			userDao.updateLoginCounter(user.getId(), user.getLoginCounter()+ 1 );
		}
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		
	}

	

}
