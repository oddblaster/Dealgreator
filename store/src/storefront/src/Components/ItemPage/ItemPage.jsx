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
        <ul>
        <li key={item.name}>
            <img src={item.image} alt={item.name} className="productImage"></img>
            <p className="productName">{item.name}</p>
            <p className="productPrice">${item.price}</p>
            <p className="Description">{item.description}</p>
        </li>
    </ul>
    )
}
export default ItemPage