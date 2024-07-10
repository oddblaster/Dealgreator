import { useState, useEffect} from 'react'
import './Store.css'
import Navigation from '../Navigation/Navigation';


function Product(props){
    return (
        <div className="product">
            <img src={props.image} alt={props.name} className="productImage"></img>
            <p className="productName">{props.name}</p>
            <p className="productPrice">${props.price}</p>
            <p className="Description">{props.description}</p>
            <button className="addToCartButton">Add to Cart</button>
        </div>
    )
}
function Products(){
    const [item, setItem] = useState([]);

    useEffect (() => {
        fetch("http://localhost:8080/item/getItems")
    .then(response => response.json())
    .then(json => setItem(json))
    .catch(error =>console.error(error));
    },[]);
    console.log(item)

    return (
        <ul className='productList'>
            {item.map(product => (
                <Product key={product.name} name={product.name} price={product.price} image={"test.png"} description={product.description}></Product>
            ))}
        </ul>
    );
}

function Store() {
    return (
        
        <div>
            <div>
                <h1 className="store">Dealgreator</h1>
                <Products/>
            </div>
        </div>
    );
}

export default Store;