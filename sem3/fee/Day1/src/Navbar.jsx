import {NavLink} from "react-router-dom";
import "./Navbar.css";

const Navbar = () => {
  return (
    <nav className="navbar">
      <div className="navbar-logo">BrandLogo</div>
      <ul className="navbar-links">
        <li>
          <NavLink
            to="/"
            className={({isActive}) => (isActive ? "active" : "")}
          >
            Home
          </NavLink>
        </li>
        <li>
          <NavLink
            to="/about"
            className={({isActive}) => (isActive ? "active" : "")}
          >
            About
          </NavLink>
        </li>
        <li>
          <NavLink
            to="/services"
            className={({isActive}) => (isActive ? "active" : "")}
          >
            Services
          </NavLink>
        </li>
      </ul>
    </nav>
  );
};

export default Navbar;
