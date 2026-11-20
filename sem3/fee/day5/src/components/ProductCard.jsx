import { useState } from 'react';
import { useCart } from '../context/CartContext';

export default function ProductCard({ product, onViewDetails }) {
  const { addToCart } = useCart();
  const [added, setAdded] = useState(false);

  const handleAdd = (e) => {
    e.stopPropagation();
    addToCart(product);
    setAdded(true);
    setTimeout(() => setAdded(false), 1200);
  };

  return (
    <div className="product-card" onClick={() => onViewDetails(product)}>
      <div className="product-image-container">
        <img
          src={product.thumbnail}
          alt={product.title}
          className="product-image"
          loading="lazy"
        />
        <span className="category-pill">{product.category}</span>
      </div>

      <div className="product-info">
        <h3 className="product-title" title={product.title}>
          {product.title}
        </h3>

        <div className="product-meta">
          <span className="product-price">${product.price}</span>
          <span className="product-rating">★ {product.rating}</span>
        </div>

        <div className="card-actions">
          <button
            type="button"
            className="btn-details"
            onClick={(e) => {
              e.stopPropagation();
              onViewDetails(product);
            }}
          >
            Details
          </button>
          <button
            type="button"
            className={`btn-add ${added ? 'added' : ''}`}
            onClick={handleAdd}
          >
            {added ? '✓ Added' : '+ Add to Cart'}
          </button>
        </div>
      </div>
    </div>
  );
}
