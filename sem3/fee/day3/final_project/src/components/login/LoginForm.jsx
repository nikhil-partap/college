import {useState} from "react";
import InputField from "./InputField";
import LoginButton from "./LoginButton";

function LoginForm() {
  const [form, setForm] = useState({username: "", password: ""});
  const [error, setError] = useState("");

  function handleChange(e) {
    setForm((prev) => ({...prev, [e.target.name]: e.target.value}));
    setError("");
  }

  function handleSubmit(e) {
    e.preventDefault();
    if (!form.username || !form.password) {
      setError("Please fill in all fields.");
      return;
    }
    // TODO: connect to auth logic
    console.log("Login submitted:", form.username);
  }

  return (
    <form className="flex flex-col gap-4" onSubmit={handleSubmit} noValidate>
      <InputField
        label="Username"
        type="text"
        id="username"
        value={form.username}
        onChange={handleChange}
        placeholder="Enter your username"
      />
      <InputField
        label="Password"
        type="password"
        id="password"
        value={form.password}
        onChange={handleChange}
        placeholder="Enter your password"
      />
      {error && (
        <p
          role="alert"
          className="text-xs text-red-600 bg-red-50 border border-red-200 rounded-md px-3 py-2"
        >
          {error}
        </p>
      )}
      <LoginButton label="Login" />
      <p className="text-sm text-gray-500 text-center">
        Don&apos;t have an account?{" "}
        <a href="#" className="text-indigo-500 font-medium hover:underline">
          Sign up
        </a>
      </p>
    </form>
  );
}

export default LoginForm;
