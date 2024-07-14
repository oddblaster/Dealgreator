import {useState, useEffect, BrowserRouter} from 'react'

import { useLocation } from "react-router-dom";



function ItemPage(){

    const location = useLocation();
    const id = location.state.productId
    const [item, setItem] = useState([]);

    useEffect (() => {
        fetch("http://localhost:8080/item/getItem/" + id )
    .then(response => response.json())
    .then(json => setItem(json))
    .catch(error =>console.error(error));
    },[]);
    console.log(item)
    
    return(
        <div>
            <ul>
            {item.map(product => (

                <li key={product.name}>
                    <img src={product.image} alt={product.name} className="productImage"></img>
                    <p className="productName">{product.name}</p>
                    <p className="productPrice">${product.price}</p>
                    <p className="Description">{product.description}</p>
                </li>
           ))}
        </ul>
        </div>
    )
}
export default ItemPage