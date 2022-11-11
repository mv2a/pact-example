export const getEndpoint = () => {
    if (process.env.REACT_APP_MOCKED) {
        return "http://localhost:8082/user";
    }
    return "http://localhost:8888/user"
};