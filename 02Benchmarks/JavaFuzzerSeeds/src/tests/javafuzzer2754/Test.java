package tests.javafuzzer2754;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 19:49:22 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=4019235223L;
    public static double dFld=1.85501;
    public static float fFld=-73.913F;
    public static volatile int iFld=-54982;
    public short sFld=-18664;
    public static long lArrFld[]=new long[N];
    public float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -54749L);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i4) {

        int i5=-1984, i6=6, i7=0;
        double d=-1.26461;
        float f=50.726F;

        for (i5 = 309; i5 > 8; --i5) {
            for (d = i5; d < 5; ++d) {
                byte by=53;
                i4 = (int)Test.instanceCount;
                Test.instanceCount *= Test.instanceCount;
                i7 = (int)d;
                i4 <<= i7;
                i6 += by;
                if (false) break;
                i6 += (int)(d * d);
                f += (float)d;
                f = Test.instanceCount;
            }
            i7 += i6;
            i7 |= i6;
        }
        Test.dFld = Test.instanceCount;
        Test.instanceCount -= -4;
        vMeth1_check_sum += i4 + i5 + i6 + Double.doubleToLongBits(d) + i7 + Float.floatToIntBits(f);
    }

    public static void vMeth(int i1) {

        int i2=-78, i3=13, i8=60873, i9=52, iArr[]=new int[N];
        boolean b=true;
        short s=-11532;
        float fArr[]=new float[N];
        double dArr[]=new double[N];

        FuzzerUtils.init(iArr, -14168);
        FuzzerUtils.init(fArr, 0.153F);
        FuzzerUtils.init(dArr, 98.41482);

        for (i2 = 8; i2 < 132; i2 += 2) {
            i1 += i2;
            iArr = (iArr = (iArr = (iArr = iArr)));
            vMeth1(i1);
            if (b) break;
            i1 = (int)Test.instanceCount;
            fArr[i2] = i3;
            iArr[i2 - 1] = i3;
            for (i8 = 1; i8 < 25; ++i8) {
                i9 = (int)Test.dFld;
                i9 = -173;
                Test.fFld = i1;
                i3 ^= i9;
                dArr[i2] += i2;
                Test.dFld = s;
            }
        }
        vMeth_check_sum += i1 + i2 + i3 + (b ? 1 : 0) + i8 + i9 + s + FuzzerUtils.checkSum(iArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static void vSmallMeth() {

        int i=50542;

        i = (int)Math.min(Test.lArrFld[(i >>> 1) % N]--, Test.lArrFld[(-63041 >>> 1) % N]);
        vMeth(-130);
        vSmallMeth_check_sum += i;
    }

    public void mainTest(String[] strArr1) {

        int i10=-3, i11=-114, i12=-7, i13=149, iArr1[]=new int[N];
        long l=-3461924985L;
        byte by1=-21, byArr[]=new byte[N];

        FuzzerUtils.init(iArr1, -37597);
        FuzzerUtils.init(byArr, (byte)-72);

        for (int smallinvoc=0; smallinvoc<665; smallinvoc++) vSmallMeth();
        Test.dFld = Test.iFld;
        for (i10 = 3; i10 < 283; ++i10) {
            Test.iFld -= -2;
            for (l = 5; 90 > l; ++l) {
                i12 = Test.iFld;
                i13 = 1;
                while (++i13 < 2) {
                    switch (((Test.iFld >>> 1) % 4) + 89) {
                    case 89:
                        Test.instanceCount = -43699;
                        i12 += (int)-55L;
                        Test.instanceCount = (long)Test.fFld;
                        Test.instanceCount |= Test.instanceCount;
                    case 90:
                        fArrFld[(int)(l - 1)] -= -24604;
                        break;
                    case 91:
                        iArr1[(int)(l - 1)] = (int)Test.fFld;
                        Test.instanceCount = i13;
                        Test.fFld += (39651 + (i13 * i13));
                        Test.fFld -= 11;
                        break;
                    case 92:
                        Test.fFld += i13;
                        i11 = (int)Test.instanceCount;
                        byArr[i10 + 1] = (byte)i11;
                        break;
                    default:
                        Test.fFld = i11;
                        Test.instanceCount *= 9;
                    }
                    switch ((((i13 >>> 1) % 2) * 5) + 85) {
                    case 92:
                        Test.iFld <<= 214;
                        Test.dFld = i10;
                        break;
                    case 89:
                        sFld >>= (short)l;
                        i11 <<= i10;
                        break;
                    default:
                        Test.fFld += by1;
                        iArr1 = iArr1;
                        i11 += 14650;
                    }
                }
            }
        }



    }
    public static void main(String[] strArr) {

        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr);
            }
         } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
         }
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  vMeth ->  vMeth vSmallMeth mainTest Test
//DEBUG  vMeth1 ->  vMeth1 vMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
