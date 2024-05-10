package tests.javafuzzer3355;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 06:38:19 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-56107L;
    public static float fFld=-92.222F;
    public static short sFld=17525;
    public byte byFld=-46;
    public byte byArrFld[]=new byte[N];
    public volatile long lArrFld[]=new long[N];

    public static long dMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public void vMeth(int i3) {

        int i4=11066, i5=-55769, i6=-20570, i7=46805, i8=5664, i9=-190, i10=11, iArr[]=new int[N];
        short s=-10849;
        boolean b1=true, bArr[]=new boolean[N];

        FuzzerUtils.init(iArr, -181);
        FuzzerUtils.init(bArr, true);

        Test.instanceCount += i3;
        Test.instanceCount = i3;
        for (i4 = 312; i4 > 1; --i4) {
            switch ((i4 % 2) + 70) {
            case 70:
                Test.fFld = -2587304248L;
                iArr[(i4 >>> 1) % N] += (int)Test.instanceCount;
                Test.instanceCount += (((i4 * i5) + i5) - i3);
            case 71:
                bArr = bArr;
            }
        }
        for (i6 = 23; i6 < 390; ++i6) {
            i3 += s;
            i7 *= i5;
        }
        i8 = 129;
        do {
            for (i9 = 1; 12 > i9; ++i9) {
                Test.instanceCount = i6;
                if (b1) continue;
            }
        } while (--i8 > 0);
        vMeth_check_sum += i3 + i4 + i5 + i6 + i7 + s + i8 + i9 + i10 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(iArr) +
            FuzzerUtils.checkSum(bArr);
    }

    public int iMeth() {

        int i2=-45, i11=31152, i12=8, i13=-2, iArr1[]=new int[N];
        float f=-1.801F;

        FuzzerUtils.init(iArr1, -14);

        i2 = 310;
        do {
            vMeth(i2);
            f = 1;
            while (++f < 5) {
                Test.fFld *= i2;
                Test.instanceCount -= i2;
                i11 = (int)Test.instanceCount;
                iArr1[(int)(f - 1)] += 9;
                i11 = (int)f;
                for (i12 = 1; i12 < 1; ++i12) {
                    i13 += i13;
                    Test.instanceCount += i12;
                    i11 += 4;
                    i13 = i2;
                    i11 -= i12;
                    if (true) continue;
                }
            }
        } while (--i2 > 0);
        long meth_res = i2 + Float.floatToIntBits(f) + i11 + i12 + i13 + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public double dMeth() {

        int i=-225, i1=-11, i14=5, i15=-12;
        boolean b=true;
        byte by=67;

        for (i = 11; i < 362; i++) {
            b = ((b | (by >= -11)) & ((i - by) >= by));
            Test.fFld *= iMeth();
            i1 >>>= 88;
            Test.sFld += (short)i;
            i1 += (int)Test.fFld;
        }
        switch (((i1 >>> 1) % 3) + 43) {
        case 43:
        case 44:
            by += (byte)Test.instanceCount;
        case 45:
            for (i14 = 4; i14 < 148; i14++) {
                switch (((i15 >>> 1) % 1) + 46) {
                case 46:
                    Test.sFld *= (short)i1;
                    if (b) continue;
                    i1 = i15;
                    i1 = Test.sFld;
                    break;
                }
                Test.fFld = i;
            }
        }
        long meth_res = i + i1 + (b ? 1 : 0) + by + i14 + i15;
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public void mainTest(String[] strArr1) {

        double d=-112.62483;
        int i16=-157, i17=199, i18=63, i19=-11, i20=10178, i21=-13, i22=4, i23=-30, i24=7, iArr2[]=new int[N];
        boolean b2=false;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 0.770F);
        FuzzerUtils.init(iArr2, 0);

        dMeth();
        Test.instanceCount -= (long)d;
        i16 += (int)Test.instanceCount;
        for (float f1 : fArr) {
            i16 -= (int)Test.instanceCount;
            byArrFld[(i16 >>> 1) % N] = (byte)i16;
            iArr2[(21848 >>> 1) % N] += Test.sFld;
        }
        i16 >>= -54350;
        if (b2) {
            Test.instanceCount *= -143;
            Test.instanceCount = i16;
            i16 = i16;
            try {
                Test.fFld += Test.sFld;
                for (i17 = 11; i17 < 325; i17++) {
                    i16 = i18;
                    for (i19 = 80; i19 > 5; --i19) {
                        i16 *= i19;
                        lArrFld[i17 - 1] *= i17;
                        iArr2[i19 + 1] >>= -45;
                        Test.instanceCount += i18;
                        Test.fFld += (float)66.117456;
                        iArr2[i19] -= (int)Test.instanceCount;
                    }
                    for (i21 = 5; i21 < 80; i21 += 2) {
                        byFld += (byte)i21;
                    }
                }
                if (false) {
                    i22 = i19;
                    for (i23 = 356; 12 < i23; --i23) {
                        Test.instanceCount += i18;
                        byFld += (byte)d;
                    }
                } else if (b2) {
                    if ((250) < 65536) throw new UserDefinedExceptionTest();
                }
            }
            catch (UserDefinedExceptionTest exc2) {
                i20 %= (int)(i19 | 1);
            }
            finally {
                Test.instanceCount += (long)d;
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
class UserDefinedExceptionTest extends RuntimeException {
    public int field;
}

//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  dMeth ->  dMeth mainTest
//DEBUG  iMeth ->  iMeth dMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth dMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}