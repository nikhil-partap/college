import { useCart } from '../context/CartContext';

export default function Navbar({ searchQuery, setSearchQuery, onOpenCart }) {
  const { totalCount } = useCart();

  return (
    <header className="navbar">
      <div className="nav-container">
        <div className="logo" onClick={() => window.scrollTo({ top: 0, behavior: 'smooth' })}>
          <span className="logo-icon">🛒</span>
          <h2>ShopSmart</h2>
        </div>

        <div className="search-box">
          <input
            type="text"
            placeholder="Search products (debounced)..."
            value={searchQuery}
            onChange={(e) => setSearchQuery(e.target.value)}
          />
          {searchQuery && (
            <button className="clear-btn" onClick={() => setSearchQuery('')}>
              ✕
            </button>
          )}
        </div>

        <button className="cart-btn" onClick={onOpenCart}>
          <span className="cart-icon">🛍️</span>
          <span className="cart-text">Cart</span>
          {totalCount > 0 && <span className="cart-badge">{totalCount}</span>}
        </button>
      </div>
    </header>
  );
}
