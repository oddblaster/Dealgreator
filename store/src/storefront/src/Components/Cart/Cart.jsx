import {useState, useEffect} from 'react'
import './Cart.jsx'
import Navigation from '../Navigation/Navigation';


function CartSection(){
    const [items, setItem] = useState([]);
    useEffect (() => {
        fetch("http://localhost:8080/cart/getCart")
        .then(response => response.json())
        .then(json => setItem(json))
        .catch(error =>console.error(error));
    },[]);
    console.log(item)

    return(
    <ul className='productList'>
        {items.map(product => (
            <li key={product.name}>
                <img src={product.image} alt={product.name} className="productImage"></img>
                <p className="productName">{product.name}</p>
                <p className="productPrice">${product.price}</p>
                <p className="Description">{product.description}</p>
                <button className="addToCartButton">Add to Cart</button>
            </li>
        ))}
    </ul>
    );
}

function CartPage(){

    return (
        <div>
            <Navigation />
            <h1>Cart</h1>
        </div>
    )
}

export default CartPage;