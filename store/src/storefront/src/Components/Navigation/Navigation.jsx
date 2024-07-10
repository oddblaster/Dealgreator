import { BrowserRouter as Router, Route, Link, Routes, useNavigate} from "react-router-dom";
import Store from "../Store/Store";
import Cart from "../Cart/Cart";
import './Navigation.css';



function Cart(){
    const navigate = useNavigate()
    
    const goToCart=()=>{
        navigate("/cart");
      }
    return(
        <button onClick={goToCart} className="cartButton">
        <img src="https://cdn.iconscout.com/icon/free/png-256/free-shopping-trolley-2130858-1794989.png" 
        alt="../assets/ShoppingCart.png" className="cart"></img>
        </button>
    )
}

function navigation(){
    return (
        <Router>
        <div className="div">
            <nav>
                <ul className="navbar">
                    <li><Link to="/">Home</Link></li>
                    <li><a href="#">About</a></li>
                    <li><Link to="/Store">Store</Link></li>
                    <li><a href="#">Contact</a></li>
                </ul>

            </nav>
            <Cart />
        </div>
        <Routes>
                <Route path="/Store" element={<Store />} />
        </Routes>
        </Router>
    )
}

export default navigation;